//
// Copyright 2016 Amazon.com, Inc. or its affiliates (Amazon). All Rights Reserved.
//
// Code generated by AWS Mobile Hub. Amazon gives unlimited permission to 
// copy, distribute and modify it.
//
// Source code generated from template: aws-my-sample-app-android v0.9
//
package com.amazonaws.mobile;

import com.amazonaws.regions.Regions;

/**
 * This class defines constants for the developer's resource
 * identifiers and API keys. This configuration should not
 * be shared or posted to any public source code repository.
 */
public class AWSConfiguration {

    // AWS MobileHub user agent string
    public static final String AWS_MOBILEHUB_USER_AGENT =
        "MobileHub 48441ef5-ea29-4863-b1a8-82b1dc475dd1 aws-my-sample-app-android-v0.18";
    // AMAZON COGNITO
    public static final Regions AMAZON_COGNITO_REGION =
      Regions.fromName("us-east-1");
    public static final String  AMAZON_COGNITO_IDENTITY_POOL_ID =
        "us-east-1:ba29f635-c374-4c19-91f6-d2c82cde12e0";
    // AMAZON MOBILE ANALYTICS
    public static final String  AMAZON_MOBILE_ANALYTICS_APP_ID =
        "d58fecd920164460826b3424d1fbbac0";
    // Amazon Mobile Analytics region
    public static final Regions AMAZON_MOBILE_ANALYTICS_REGION = Regions.US_EAST_1;
    // Google Client ID for Web application
    public static final String GOOGLE_CLIENT_ID =
        "";
    // GOOGLE CLOUD MESSAGING SENDER ID
    public static final String GOOGLE_CLOUD_MESSAGING_SENDER_ID =
        "121323071549";

    // SNS PLATFORM APPLICATION ARN
    public static final String AMAZON_SNS_PLATFORM_APPLICATION_ARN =
        "";
    public static final Regions AMAZON_SNS_REGION =
         Regions.fromName("us-east-1");
    // SNS DEFAULT TOPIC ARN
    public static final String AMAZON_SNS_DEFAULT_TOPIC_ARN =
        "";
    // SNS PLATFORM TOPIC ARNS
    public static final String[] AMAZON_SNS_TOPIC_ARNS =
        {""};
    public static final String AMAZON_CONTENT_DELIVERY_S3_BUCKET =
        "";
    public static final Regions AMAZON_CONTENT_DELIVERY_S3_REGION =
       Regions.fromName("us-east-1");
    // S3 BUCKET
    public static final String AMAZON_S3_USER_FILES_BUCKET =
        "awssamplemessenger-userfiles-mobilehub-870889210";
    // S3 BUCKET REGION
    public static final Regions AMAZON_S3_USER_FILES_BUCKET_REGION =
        Regions.fromName("us-east-1");
    public static final Regions AMAZON_CLOUD_LOGIC_REGION =
       Regions.fromName("us-east-1");
    public static final Regions AMAZON_DYNAMODB_REGION =
       Regions.fromName("us-east-1");

    //ChatRoomDO TABLE NAME
    public static final String AMAZON_DYNAMODB_TABLENAME_CHATROOM =
            "awssamplemessenger-mobilehub-870889210-ChatRoom";
    //ConversationDO TABLE NAME
    public static final String AMAZON_DYNAMODB_TABLENAME_CONVERSATION =
            "awssamplemessenger-mobilehub-870889210-Conversation";
    //UserProfileDO TABLE NAME
    public static final String AMAZON_DYNAMODB_TABLENAME_USERPROFILE =
            "awssamplemessenger-mobilehub-870889210-UserProfile";
}
