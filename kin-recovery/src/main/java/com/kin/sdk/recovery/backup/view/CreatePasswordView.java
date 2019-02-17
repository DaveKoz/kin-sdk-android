package com.kin.sdk.recovery.backup.view;

import com.kin.sdk.recovery.base.BaseView;

public interface CreatePasswordView extends BaseView {

	void setEnterPasswordIsCorrect(boolean isCorrect);

	void setConfirmPasswordIsCorrect(boolean isCorrect);

	void enableNextButton();

	void disableNextButton();

	void showBackupFailed();

	void closeKeyboard();

	void resetEnterPasswordField();

	void resetConfirmPasswordField();
}
