package com.fittogether.server.dm.domain.dto;

import com.fittogether.server.dm.domain.entity.Request;
import lombok.*;

@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class RequestDto {


    private Long senderId; //매칭 요청하는 유저 아이디 값

    private Long receiverId; // 매창 요청받는 유저 아이디 값

    private boolean isAccept; //매칭 수락여부


    public static RequestDto from(Request request){
        return RequestDto.builder()
                .senderId(request.getSenderId())
                .receiverId(request.getReceiverId())
                .isAccept(request.isAccepted())
                .build();
    }


}
