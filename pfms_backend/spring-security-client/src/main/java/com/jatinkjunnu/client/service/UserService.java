package com.jatinkjunnu.client.service;

import com.jatinkjunnu.client.entity.UserEntity;
import com.jatinkjunnu.client.entity.VerificationToken;
import com.jatinkjunnu.client.model.UserModel;

import java.util.Optional;

public interface UserService {
    UserEntity registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, UserEntity user);

    String validateVerificationToken(String token);

    VerificationToken generateNewVerificationToken(String oldToken);

    UserEntity findUserByEmail(String email);

    void createPasswordResetTokenForUser(UserEntity user, String token);

    String validatePasswordResetToken(String token);

    Optional<UserEntity> getUserByPasswordResetToken(String token);

    void changePassword(UserEntity user, String newPassword);

    boolean checkIfValidOldPassword(UserEntity user, String oldPassword);

    boolean validateUserPassword(UserEntity user, UserModel userModel);
}
