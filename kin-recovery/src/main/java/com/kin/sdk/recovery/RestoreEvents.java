package com.kin.sdk.recovery;

public interface RestoreEvents {

	void onRestoreUploadQrCodePageViewed();

	void onRestoreUploadQrCodeBackButtonTapped();

	void onRestoreUploadQrCodeButtonTapped();

	void onRestoreAreYouSureOkButtonTapped();

	void onRestoreAreYouSureCancelButtonTapped();

	void onRestorePasswordEntryPageViewed();

	void onRestorePasswordEntryBackButtonTapped();

	void onRestorePasswordDoneButtonTapped();

}
