package com.hanallym.repository;

import com.hanallym.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    UserInfo findByUserEmail(String userEmail);
    UserInfo findByUserIdx(int userIdx);
}
//�������� db�� ������ ���� �� sql�� �ƴ϶� �ڵ�μ� �ϰ� ���ִ� ���� Ŭ������ ǥ���ϱ� ���� ���� �������丮
