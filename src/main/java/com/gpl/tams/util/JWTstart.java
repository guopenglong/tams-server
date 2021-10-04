package com.gpl.tams.util;


import io.jsonwebtoken.*;
import org.junit.Test;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import java.util.Date;
import java.util.UUID;


// jwt token 入门案例
public class JWTstart {

    private long time = 1000*60*60*24;
    private String signature = "admin";


    // 生成 token
    @Test
    public void JWTTesttt(){
        JwtBuilder jwtbuilder = Jwts.builder();
        String jwtToken = jwtbuilder
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                // 载荷
                .claim("username", "tom")
                .claim("role", "admin")
                .setSubject("admin-test")
                // 过期时间, 从当前开始算起
                .setExpiration(new Date(System.currentTimeMillis()+time))
                .setId(UUID.randomUUID().toString())
                // 签名
                .signWith(SignatureAlgorithm.HS256, signature)
                .compact();
        System.out.println(jwtToken);
    }

    // 解析 token
    @Test
    public void parse(){
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6InRvbSIsInJvbGUiOiJhZG1pbiIsInN1YiI6ImFkbWluLXRlc3QiLCJleHAiOjE2MjM5NzAwOTQsImp0aSI6ImFiMmNjMTEwLWRjZTQtNDY3OC04OWFhLTNlYWM2YTE4MjFmNSJ9.YvUTZmEd14ZNJQSU4doyPKDkO2VOwJJVPCBs492kNPE";
        JwtParser jwtParser = Jwts.parser();
        Jws<Claims> claimsJws = jwtParser.setSigningKey(signature).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();
        System.out.println(claims.get("username"));
        System.out.println(claims.get("role"));
        System.out.println(claims.getId());
        System.out.println(claims.getSubject());   // 拿到签名
        System.out.println(claims.getExpiration());  // 有效期
    }
}
