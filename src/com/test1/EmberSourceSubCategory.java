package com.test1;

public class EmberSourceSubCategory {
	private String emberSourceSubCatCode;
	private String emberSourceSubCatName;
	private String emberSourceSubCatDescription;
	private String emberSourceSubCatDefinition;
	private String emberSourceSubCatRefAuthName;
	private long errorCode;
	private String errorSeverity;
	private String ncType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public EmberSourceSubCategory() {

	}

	public EmberSourceSubCategory(String emberSourceSubCatCode, String emberSourceSubCatName,
			String emberSourceSubCatDescription, String emberSourceSubCatDefinition,
			String emberSourceSubCatRefAuthName, long errorCode, String errorSeverity, String ncType,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.emberSourceSubCatCode = emberSourceSubCatCode;
		this.emberSourceSubCatName = emberSourceSubCatName;
		this.emberSourceSubCatDescription = emberSourceSubCatDescription;
		this.emberSourceSubCatDefinition = emberSourceSubCatDefinition;
		this.emberSourceSubCatRefAuthName = emberSourceSubCatRefAuthName;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.ncType = ncType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getEmberSourceSubCatCode() {
		return emberSourceSubCatCode;
	}

	public void setEmberSourceSubCatCode(String emberSourceSubCatCode) {
		this.emberSourceSubCatCode = emberSourceSubCatCode;
	}

	public String getEmberSourceSubCatName() {
		return emberSourceSubCatName;
	}

	public void setEmberSourceSubCatName(String emberSourceSubCatName) {
		this.emberSourceSubCatName = emberSourceSubCatName;
	}

	public String getEmberSourceSubCatDescription() {
		return emberSourceSubCatDescription;
	}

	public void setEmberSourceSubCatDescription(String emberSourceSubCatDescription) {
		this.emberSourceSubCatDescription = emberSourceSubCatDescription;
	}

	public String getEmberSourceSubCatDefinition() {
		return emberSourceSubCatDefinition;
	}

	public void setEmberSourceSubCatDefinition(String emberSourceSubCatDefinition) {
		this.emberSourceSubCatDefinition = emberSourceSubCatDefinition;
	}

	public String getEmberSourceSubCatRefAuthName() {
		return emberSourceSubCatRefAuthName;
	}

	public void setEmberSourceSubCatRefAuthName(String emberSourceSubCatRefAuthName) {
		this.emberSourceSubCatRefAuthName = emberSourceSubCatRefAuthName;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSeverity() {
		return errorSeverity;
	}

	public void setErrorSeverity(String errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	public String getNcType() {
		return ncType;
	}

	public void setNcType(String ncType) {
		this.ncType = ncType;
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
