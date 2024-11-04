package com.test1;

public class EmberSourceRefAuth {
	private long authorizerId;
	private String emberSourceCatCode;
	private String emberSourceSubCatCode;
	private String versionOwner;
	private String versionVerifier;
	private String versionCompletionTeam;
	private String emailGroup;
	private long refDataId;
	private Integer sequence;
	private String modularData;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public EmberSourceRefAuth() {

	}

	public EmberSourceRefAuth(long authorizerId, String emberSourceCatCode, String emberSourceSubCatCode,
			String versionOwner, String versionVerifier, String versionCompletionTeam, String emailGroup,
			long refDataId, Integer sequence, String modularData, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.authorizerId = authorizerId;
		this.emberSourceCatCode = emberSourceCatCode;
		this.emberSourceSubCatCode = emberSourceSubCatCode;
		this.versionOwner = versionOwner;
		this.versionVerifier = versionVerifier;
		this.versionCompletionTeam = versionCompletionTeam;
		this.emailGroup = emailGroup;
		this.refDataId = refDataId;
		this.sequence = sequence;
		this.modularData = modularData;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getEmberSourceCatCode() {
		return emberSourceCatCode;
	}

	public void setEmberSourceCatCode(String emberSourceCatCode) {
		this.emberSourceCatCode = emberSourceCatCode;
	}

	public String getEmberSourceSubCatCode() {
		return emberSourceSubCatCode;
	}

	public void setEmberSourceSubCatCode(String emberSourceSubCatCode) {
		this.emberSourceSubCatCode = emberSourceSubCatCode;
	}

	public String getVersionOwner() {
		return versionOwner;
	}

	public void setVersionOwner(String versionOwner) {
		this.versionOwner = versionOwner;
	}

	public String getVersionVerifier() {
		return versionVerifier;
	}

	public void setVersionVerifier(String versionVerifier) {
		this.versionVerifier = versionVerifier;
	}

	public String getVersionCompletionTeam() {
		return versionCompletionTeam;
	}

	public void setVersionCompletionTeam(String versionCompletionTeam) {
		this.versionCompletionTeam = versionCompletionTeam;
	}

	public String getEmailGroup() {
		return emailGroup;
	}

	public void setEmailGroup(String emailGroup) {
		this.emailGroup = emailGroup;
	}

	public long getRefDataId() {
		return refDataId;
	}

	public void setRefDataId(long refDataId) {
		this.refDataId = refDataId;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
