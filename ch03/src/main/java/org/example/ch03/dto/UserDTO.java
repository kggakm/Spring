package org.example.ch03.dto;

import lombok.*;

// @Data   // Getter + Setter + ToString + RequiredArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor    // 상수 속성(final)이 있으면 그 속성만 초기화하는 생성자
@Builder
public class UserDTO {

    private String userid;
    private String name;
    private String birth;
    private int age;

}
