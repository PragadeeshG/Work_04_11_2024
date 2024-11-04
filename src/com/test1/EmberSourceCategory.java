package com.test1;

public class EmberSourceCategory {
	private String emberSourceCatCode;
	private String emberSourceCatName;
	private String emberSourceCatDescription;
	private String emberSourceCatDefinition;
	private long authorizerId;
	private String owner;
	private String psIds;
	private long serviceNameId;
	private String creationDate;
	private String modifiedDate;

	public EmberSourceCategory() {

	}

	public EmberSourceCategory(String emberSourceCatCode, String emberSourceCatName, String emberSourceCatDescription,
			String emberSourceCatDefinition, long authorizerId, String owner, String psIds, long serviceNameId,
			String creationDate, String modifiedDate) {
		super();
		this.emberSourceCatCode = emberSourceCatCode;
		this.emberSourceCatName = emberSourceCatName;
		this.emberSourceCatDescription = emberSourceCatDescription;
		this.emberSourceCatDefinition = emberSourceCatDefinition;
		this.authorizerId = authorizerId;
		this.owner = owner;
		this.psIds = psIds;
		this.serviceNameId = serviceNameId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getEmberSourceCatCode() {
		return emberSourceCatCode;
	}

	public void setEmberSourceCatCode(String emberSourceCatCode) {
		this.emberSourceCatCode = emberSourceCatCode;
	}

	public String getEmberSourceCatName() {
		return emberSourceCatName;
	}

	public void setEmberSourceCatName(String emberSourceCatName) {
		this.emberSourceCatName = emberSourceCatName;
	}

	public String getEmberSourceCatDescription() {
		return emberSourceCatDescription;
	}

	public void setEmberSourceCatDescription(String emberSourceCatDescription) {
		this.emberSourceCatDescription = emberSourceCatDescription;
	}

	public String getEmberSourceCatDefinition() {
		return emberSourceCatDefinition;
	}

	public void setEmberSourceCatDefinition(String emberSourceCatDefinition) {
		this.emberSourceCatDefinition = emberSourceCatDefinition;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPsIds() {
		return psIds;
	}

	public void setPsIds(String psIds) {
		this.psIds = psIds;
	}

	public long getServiceNameId() {
		return serviceNameId;
	}

	public void setServiceNameId(long serviceNameId) {
		this.serviceNameId = serviceNameId;
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

}
