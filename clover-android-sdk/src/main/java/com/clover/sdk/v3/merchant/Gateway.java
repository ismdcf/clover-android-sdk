/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.merchant;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getPaymentProcessorName paymentProcessorName}</li>
 * <li>{@link #getAuthorizationFrontEnd authorizationFrontEnd}</li>
 * <li>{@link #getAcquiringBackEnd acquiringBackEnd}</li>
 * <li>{@link #getPaymentGatewayApi paymentGatewayApi}</li>
 * <li>{@link #getAccountName accountName}</li>
 * <li>{@link #getAltMid altMid}</li>
 * <li>{@link #getMid mid}</li>
 * <li>{@link #getTid tid}</li>
 * <li>{@link #getStoreId storeId}</li>
 * <li>{@link #getSupportsTipping supportsTipping}</li>
 * <li>{@link #getFrontendMid frontendMid}</li>
 * <li>{@link #getBackendMid backendMid}</li>
 * <li>{@link #getMcc mcc}</li>
 * <li>{@link #getSupportsTipAdjust supportsTipAdjust}</li>
 * <li>{@link #getSupportsNakedCredit supportsNakedCredit}</li>
 * <li>{@link #getSupportsMultiPayToken supportsMultiPayToken}</li>
 * <li>{@link #getClosingTime closingTime}</li>
 * <li>{@link #getNewBatchCloseEnabled newBatchCloseEnabled}</li>
 * </ul>
 */
@SuppressWarnings("all")
public final class Gateway implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getPaymentProcessorName() {
    return genClient.cacheGet(CacheKey.paymentProcessorName);
  }

  public java.lang.String getAuthorizationFrontEnd() {
    return genClient.cacheGet(CacheKey.authorizationFrontEnd);
  }

  public java.lang.String getAcquiringBackEnd() {
    return genClient.cacheGet(CacheKey.acquiringBackEnd);
  }

  public java.lang.String getPaymentGatewayApi() {
    return genClient.cacheGet(CacheKey.paymentGatewayApi);
  }

  public java.lang.String getAccountName() {
    return genClient.cacheGet(CacheKey.accountName);
  }

  public java.lang.String getAltMid() {
    return genClient.cacheGet(CacheKey.altMid);
  }

  public java.lang.String getMid() {
    return genClient.cacheGet(CacheKey.mid);
  }

  public java.lang.String getTid() {
    return genClient.cacheGet(CacheKey.tid);
  }

  public java.lang.String getStoreId() {
    return genClient.cacheGet(CacheKey.storeId);
  }

  public java.lang.Boolean getSupportsTipping() {
    return genClient.cacheGet(CacheKey.supportsTipping);
  }

  public java.lang.String getFrontendMid() {
    return genClient.cacheGet(CacheKey.frontendMid);
  }

  public java.lang.String getBackendMid() {
    return genClient.cacheGet(CacheKey.backendMid);
  }

  /**
   * Merchant Category Code
   */
  public java.lang.String getMcc() {
    return genClient.cacheGet(CacheKey.mcc);
  }

  public java.lang.Boolean getSupportsTipAdjust() {
    return genClient.cacheGet(CacheKey.supportsTipAdjust);
  }

  public java.lang.Boolean getSupportsNakedCredit() {
    return genClient.cacheGet(CacheKey.supportsNakedCredit);
  }

  public java.lang.Boolean getSupportsMultiPayToken() {
    return genClient.cacheGet(CacheKey.supportsMultiPayToken);
  }

  public java.lang.String getClosingTime() {
    return genClient.cacheGet(CacheKey.closingTime);
  }

  public java.lang.Boolean getNewBatchCloseEnabled() {
    return genClient.cacheGet(CacheKey.newBatchCloseEnabled);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Gateway> {
    paymentProcessorName {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("paymentProcessorName", java.lang.String.class);
      }
    },
    authorizationFrontEnd {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("authorizationFrontEnd", java.lang.String.class);
      }
    },
    acquiringBackEnd {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("acquiringBackEnd", java.lang.String.class);
      }
    },
    paymentGatewayApi {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("paymentGatewayApi", java.lang.String.class);
      }
    },
    accountName {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("accountName", java.lang.String.class);
      }
    },
    altMid {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("altMid", java.lang.String.class);
      }
    },
    mid {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("mid", java.lang.String.class);
      }
    },
    tid {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("tid", java.lang.String.class);
      }
    },
    storeId {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("storeId", java.lang.String.class);
      }
    },
    supportsTipping {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("supportsTipping", java.lang.Boolean.class);
      }
    },
    frontendMid {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("frontendMid", java.lang.String.class);
      }
    },
    backendMid {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("backendMid", java.lang.String.class);
      }
    },
    mcc {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("mcc", java.lang.String.class);
      }
    },
    supportsTipAdjust {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("supportsTipAdjust", java.lang.Boolean.class);
      }
    },
    supportsNakedCredit {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("supportsNakedCredit", java.lang.Boolean.class);
      }
    },
    supportsMultiPayToken {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("supportsMultiPayToken", java.lang.Boolean.class);
      }
    },
    closingTime {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("closingTime", java.lang.String.class);
      }
    },
    newBatchCloseEnabled {
      @Override
      public Object extractValue(Gateway instance) {
        return instance.genClient.extractOther("newBatchCloseEnabled", java.lang.Boolean.class);
      }
    },
    ;
  }

  private GenericClient<Gateway> genClient = new GenericClient<Gateway>(this);

  /**
   * Constructs a new empty instance.
   */
  public Gateway() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Gateway(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Gateway(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Gateway(Gateway src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
    genClient.validateLength(getPaymentProcessorName(), 127);

    genClient.validateLength(getAuthorizationFrontEnd(), 10);

    genClient.validateLength(getAcquiringBackEnd(), 10);
  }

  /** Checks whether the 'paymentProcessorName' field is set and is not null */
  public boolean isNotNullPaymentProcessorName() {
    return genClient.cacheValueIsNotNull(CacheKey.paymentProcessorName);
  }

  /** Checks whether the 'authorizationFrontEnd' field is set and is not null */
  public boolean isNotNullAuthorizationFrontEnd() {
    return genClient.cacheValueIsNotNull(CacheKey.authorizationFrontEnd);
  }

  /** Checks whether the 'acquiringBackEnd' field is set and is not null */
  public boolean isNotNullAcquiringBackEnd() {
    return genClient.cacheValueIsNotNull(CacheKey.acquiringBackEnd);
  }

  /** Checks whether the 'paymentGatewayApi' field is set and is not null */
  public boolean isNotNullPaymentGatewayApi() {
    return genClient.cacheValueIsNotNull(CacheKey.paymentGatewayApi);
  }

  /** Checks whether the 'accountName' field is set and is not null */
  public boolean isNotNullAccountName() {
    return genClient.cacheValueIsNotNull(CacheKey.accountName);
  }

  /** Checks whether the 'altMid' field is set and is not null */
  public boolean isNotNullAltMid() {
    return genClient.cacheValueIsNotNull(CacheKey.altMid);
  }

  /** Checks whether the 'mid' field is set and is not null */
  public boolean isNotNullMid() {
    return genClient.cacheValueIsNotNull(CacheKey.mid);
  }

  /** Checks whether the 'tid' field is set and is not null */
  public boolean isNotNullTid() {
    return genClient.cacheValueIsNotNull(CacheKey.tid);
  }

  /** Checks whether the 'storeId' field is set and is not null */
  public boolean isNotNullStoreId() {
    return genClient.cacheValueIsNotNull(CacheKey.storeId);
  }

  /** Checks whether the 'supportsTipping' field is set and is not null */
  public boolean isNotNullSupportsTipping() {
    return genClient.cacheValueIsNotNull(CacheKey.supportsTipping);
  }

  /** Checks whether the 'frontendMid' field is set and is not null */
  public boolean isNotNullFrontendMid() {
    return genClient.cacheValueIsNotNull(CacheKey.frontendMid);
  }

  /** Checks whether the 'backendMid' field is set and is not null */
  public boolean isNotNullBackendMid() {
    return genClient.cacheValueIsNotNull(CacheKey.backendMid);
  }

  /** Checks whether the 'mcc' field is set and is not null */
  public boolean isNotNullMcc() {
    return genClient.cacheValueIsNotNull(CacheKey.mcc);
  }

  /** Checks whether the 'supportsTipAdjust' field is set and is not null */
  public boolean isNotNullSupportsTipAdjust() {
    return genClient.cacheValueIsNotNull(CacheKey.supportsTipAdjust);
  }

  /** Checks whether the 'supportsNakedCredit' field is set and is not null */
  public boolean isNotNullSupportsNakedCredit() {
    return genClient.cacheValueIsNotNull(CacheKey.supportsNakedCredit);
  }

  /** Checks whether the 'supportsMultiPayToken' field is set and is not null */
  public boolean isNotNullSupportsMultiPayToken() {
    return genClient.cacheValueIsNotNull(CacheKey.supportsMultiPayToken);
  }

  /** Checks whether the 'closingTime' field is set and is not null */
  public boolean isNotNullClosingTime() {
    return genClient.cacheValueIsNotNull(CacheKey.closingTime);
  }

  /** Checks whether the 'newBatchCloseEnabled' field is set and is not null */
  public boolean isNotNullNewBatchCloseEnabled() {
    return genClient.cacheValueIsNotNull(CacheKey.newBatchCloseEnabled);
  }


  /** Checks whether the 'paymentProcessorName' field has been set, however the value could be null */
  public boolean hasPaymentProcessorName() {
    return genClient.cacheHasKey(CacheKey.paymentProcessorName);
  }

  /** Checks whether the 'authorizationFrontEnd' field has been set, however the value could be null */
  public boolean hasAuthorizationFrontEnd() {
    return genClient.cacheHasKey(CacheKey.authorizationFrontEnd);
  }

  /** Checks whether the 'acquiringBackEnd' field has been set, however the value could be null */
  public boolean hasAcquiringBackEnd() {
    return genClient.cacheHasKey(CacheKey.acquiringBackEnd);
  }

  /** Checks whether the 'paymentGatewayApi' field has been set, however the value could be null */
  public boolean hasPaymentGatewayApi() {
    return genClient.cacheHasKey(CacheKey.paymentGatewayApi);
  }

  /** Checks whether the 'accountName' field has been set, however the value could be null */
  public boolean hasAccountName() {
    return genClient.cacheHasKey(CacheKey.accountName);
  }

  /** Checks whether the 'altMid' field has been set, however the value could be null */
  public boolean hasAltMid() {
    return genClient.cacheHasKey(CacheKey.altMid);
  }

  /** Checks whether the 'mid' field has been set, however the value could be null */
  public boolean hasMid() {
    return genClient.cacheHasKey(CacheKey.mid);
  }

  /** Checks whether the 'tid' field has been set, however the value could be null */
  public boolean hasTid() {
    return genClient.cacheHasKey(CacheKey.tid);
  }

  /** Checks whether the 'storeId' field has been set, however the value could be null */
  public boolean hasStoreId() {
    return genClient.cacheHasKey(CacheKey.storeId);
  }

  /** Checks whether the 'supportsTipping' field has been set, however the value could be null */
  public boolean hasSupportsTipping() {
    return genClient.cacheHasKey(CacheKey.supportsTipping);
  }

  /** Checks whether the 'frontendMid' field has been set, however the value could be null */
  public boolean hasFrontendMid() {
    return genClient.cacheHasKey(CacheKey.frontendMid);
  }

  /** Checks whether the 'backendMid' field has been set, however the value could be null */
  public boolean hasBackendMid() {
    return genClient.cacheHasKey(CacheKey.backendMid);
  }

  /** Checks whether the 'mcc' field has been set, however the value could be null */
  public boolean hasMcc() {
    return genClient.cacheHasKey(CacheKey.mcc);
  }

  /** Checks whether the 'supportsTipAdjust' field has been set, however the value could be null */
  public boolean hasSupportsTipAdjust() {
    return genClient.cacheHasKey(CacheKey.supportsTipAdjust);
  }

  /** Checks whether the 'supportsNakedCredit' field has been set, however the value could be null */
  public boolean hasSupportsNakedCredit() {
    return genClient.cacheHasKey(CacheKey.supportsNakedCredit);
  }

  /** Checks whether the 'supportsMultiPayToken' field has been set, however the value could be null */
  public boolean hasSupportsMultiPayToken() {
    return genClient.cacheHasKey(CacheKey.supportsMultiPayToken);
  }

  /** Checks whether the 'closingTime' field has been set, however the value could be null */
  public boolean hasClosingTime() {
    return genClient.cacheHasKey(CacheKey.closingTime);
  }

  /** Checks whether the 'newBatchCloseEnabled' field has been set, however the value could be null */
  public boolean hasNewBatchCloseEnabled() {
    return genClient.cacheHasKey(CacheKey.newBatchCloseEnabled);
  }


  /**
   * Sets the field 'paymentProcessorName'.
   */
  public Gateway setPaymentProcessorName(java.lang.String paymentProcessorName) {
    return genClient.setOther(paymentProcessorName, CacheKey.paymentProcessorName);
  }

  /**
   * Sets the field 'authorizationFrontEnd'.
   */
  public Gateway setAuthorizationFrontEnd(java.lang.String authorizationFrontEnd) {
    return genClient.setOther(authorizationFrontEnd, CacheKey.authorizationFrontEnd);
  }

  /**
   * Sets the field 'acquiringBackEnd'.
   */
  public Gateway setAcquiringBackEnd(java.lang.String acquiringBackEnd) {
    return genClient.setOther(acquiringBackEnd, CacheKey.acquiringBackEnd);
  }

  /**
   * Sets the field 'paymentGatewayApi'.
   */
  public Gateway setPaymentGatewayApi(java.lang.String paymentGatewayApi) {
    return genClient.setOther(paymentGatewayApi, CacheKey.paymentGatewayApi);
  }

  /**
   * Sets the field 'accountName'.
   */
  public Gateway setAccountName(java.lang.String accountName) {
    return genClient.setOther(accountName, CacheKey.accountName);
  }

  /**
   * Sets the field 'altMid'.
   */
  public Gateway setAltMid(java.lang.String altMid) {
    return genClient.setOther(altMid, CacheKey.altMid);
  }

  /**
   * Sets the field 'mid'.
   */
  public Gateway setMid(java.lang.String mid) {
    return genClient.setOther(mid, CacheKey.mid);
  }

  /**
   * Sets the field 'tid'.
   */
  public Gateway setTid(java.lang.String tid) {
    return genClient.setOther(tid, CacheKey.tid);
  }

  /**
   * Sets the field 'storeId'.
   */
  public Gateway setStoreId(java.lang.String storeId) {
    return genClient.setOther(storeId, CacheKey.storeId);
  }

  /**
   * Sets the field 'supportsTipping'.
   */
  public Gateway setSupportsTipping(java.lang.Boolean supportsTipping) {
    return genClient.setOther(supportsTipping, CacheKey.supportsTipping);
  }

  /**
   * Sets the field 'frontendMid'.
   */
  public Gateway setFrontendMid(java.lang.String frontendMid) {
    return genClient.setOther(frontendMid, CacheKey.frontendMid);
  }

  /**
   * Sets the field 'backendMid'.
   */
  public Gateway setBackendMid(java.lang.String backendMid) {
    return genClient.setOther(backendMid, CacheKey.backendMid);
  }

  /**
   * Sets the field 'mcc'.
   */
  public Gateway setMcc(java.lang.String mcc) {
    return genClient.setOther(mcc, CacheKey.mcc);
  }

  /**
   * Sets the field 'supportsTipAdjust'.
   */
  public Gateway setSupportsTipAdjust(java.lang.Boolean supportsTipAdjust) {
    return genClient.setOther(supportsTipAdjust, CacheKey.supportsTipAdjust);
  }

  /**
   * Sets the field 'supportsNakedCredit'.
   */
  public Gateway setSupportsNakedCredit(java.lang.Boolean supportsNakedCredit) {
    return genClient.setOther(supportsNakedCredit, CacheKey.supportsNakedCredit);
  }

  /**
   * Sets the field 'supportsMultiPayToken'.
   */
  public Gateway setSupportsMultiPayToken(java.lang.Boolean supportsMultiPayToken) {
    return genClient.setOther(supportsMultiPayToken, CacheKey.supportsMultiPayToken);
  }

  /**
   * Sets the field 'closingTime'.
   */
  public Gateway setClosingTime(java.lang.String closingTime) {
    return genClient.setOther(closingTime, CacheKey.closingTime);
  }

  /**
   * Sets the field 'newBatchCloseEnabled'.
   */
  public Gateway setNewBatchCloseEnabled(java.lang.Boolean newBatchCloseEnabled) {
    return genClient.setOther(newBatchCloseEnabled, CacheKey.newBatchCloseEnabled);
  }


  /** Clears the 'paymentProcessorName' field, the 'has' method for this field will now return false */
  public void clearPaymentProcessorName() {
    genClient.clear(CacheKey.paymentProcessorName);
  }
  /** Clears the 'authorizationFrontEnd' field, the 'has' method for this field will now return false */
  public void clearAuthorizationFrontEnd() {
    genClient.clear(CacheKey.authorizationFrontEnd);
  }
  /** Clears the 'acquiringBackEnd' field, the 'has' method for this field will now return false */
  public void clearAcquiringBackEnd() {
    genClient.clear(CacheKey.acquiringBackEnd);
  }
  /** Clears the 'paymentGatewayApi' field, the 'has' method for this field will now return false */
  public void clearPaymentGatewayApi() {
    genClient.clear(CacheKey.paymentGatewayApi);
  }
  /** Clears the 'accountName' field, the 'has' method for this field will now return false */
  public void clearAccountName() {
    genClient.clear(CacheKey.accountName);
  }
  /** Clears the 'altMid' field, the 'has' method for this field will now return false */
  public void clearAltMid() {
    genClient.clear(CacheKey.altMid);
  }
  /** Clears the 'mid' field, the 'has' method for this field will now return false */
  public void clearMid() {
    genClient.clear(CacheKey.mid);
  }
  /** Clears the 'tid' field, the 'has' method for this field will now return false */
  public void clearTid() {
    genClient.clear(CacheKey.tid);
  }
  /** Clears the 'storeId' field, the 'has' method for this field will now return false */
  public void clearStoreId() {
    genClient.clear(CacheKey.storeId);
  }
  /** Clears the 'supportsTipping' field, the 'has' method for this field will now return false */
  public void clearSupportsTipping() {
    genClient.clear(CacheKey.supportsTipping);
  }
  /** Clears the 'frontendMid' field, the 'has' method for this field will now return false */
  public void clearFrontendMid() {
    genClient.clear(CacheKey.frontendMid);
  }
  /** Clears the 'backendMid' field, the 'has' method for this field will now return false */
  public void clearBackendMid() {
    genClient.clear(CacheKey.backendMid);
  }
  /** Clears the 'mcc' field, the 'has' method for this field will now return false */
  public void clearMcc() {
    genClient.clear(CacheKey.mcc);
  }
  /** Clears the 'supportsTipAdjust' field, the 'has' method for this field will now return false */
  public void clearSupportsTipAdjust() {
    genClient.clear(CacheKey.supportsTipAdjust);
  }
  /** Clears the 'supportsNakedCredit' field, the 'has' method for this field will now return false */
  public void clearSupportsNakedCredit() {
    genClient.clear(CacheKey.supportsNakedCredit);
  }
  /** Clears the 'supportsMultiPayToken' field, the 'has' method for this field will now return false */
  public void clearSupportsMultiPayToken() {
    genClient.clear(CacheKey.supportsMultiPayToken);
  }
  /** Clears the 'closingTime' field, the 'has' method for this field will now return false */
  public void clearClosingTime() {
    genClient.clear(CacheKey.closingTime);
  }
  /** Clears the 'newBatchCloseEnabled' field, the 'has' method for this field will now return false */
  public void clearNewBatchCloseEnabled() {
    genClient.clear(CacheKey.newBatchCloseEnabled);
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public Gateway copyChanges() {
    Gateway copy = new Gateway();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Gateway src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Gateway(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<Gateway> CREATOR = new android.os.Parcelable.Creator<Gateway>() {
    @Override
    public Gateway createFromParcel(android.os.Parcel in) {
      Gateway instance = new Gateway(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Gateway[] newArray(int size) {
      return new Gateway[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Gateway> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Gateway>() {
    @Override
    public Gateway create(org.json.JSONObject jsonObject) {
      return new Gateway(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean PAYMENTPROCESSORNAME_IS_REQUIRED = false;
    public static final long PAYMENTPROCESSORNAME_MAX_LEN = 127;

    public static final boolean AUTHORIZATIONFRONTEND_IS_REQUIRED = false;
    public static final long AUTHORIZATIONFRONTEND_MAX_LEN = 10;

    public static final boolean ACQUIRINGBACKEND_IS_REQUIRED = false;
    public static final long ACQUIRINGBACKEND_MAX_LEN = 10;

    public static final boolean PAYMENTGATEWAYAPI_IS_REQUIRED = false;

    public static final boolean ACCOUNTNAME_IS_REQUIRED = false;

    public static final boolean ALTMID_IS_REQUIRED = false;

    public static final boolean MID_IS_REQUIRED = false;

    public static final boolean TID_IS_REQUIRED = false;

    public static final boolean STOREID_IS_REQUIRED = false;

    public static final boolean SUPPORTSTIPPING_IS_REQUIRED = false;

    public static final boolean FRONTENDMID_IS_REQUIRED = false;

    public static final boolean BACKENDMID_IS_REQUIRED = false;

    public static final boolean MCC_IS_REQUIRED = false;

    public static final boolean SUPPORTSTIPADJUST_IS_REQUIRED = false;

    public static final boolean SUPPORTSNAKEDCREDIT_IS_REQUIRED = false;

    public static final boolean SUPPORTSMULTIPAYTOKEN_IS_REQUIRED = false;

    public static final boolean CLOSINGTIME_IS_REQUIRED = false;

    public static final boolean NEWBATCHCLOSEENABLED_IS_REQUIRED = false;

  }

}
