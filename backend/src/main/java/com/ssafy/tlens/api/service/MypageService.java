package com.ssafy.tlens.api.service;

import com.ssafy.tlens.api.response.UserInfoResponseDTO;

import java.util.List;

public interface MypageService {

    UserInfoResponseDTO getUserInfo(Long id);

    List<String> getUserKeyword(Long id);
}
