package com.relecotech.androidsparsh_rukmin.utils;

import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.blob.CloudBlobClient;
import com.microsoft.azure.storage.blob.CloudBlobContainer;

/**
 * Created by Relecotech on 01-02-2018.
 */

public class AzureConfiguration {

    //    public static String DEVELOPER_KEY = "";
    public static String DEVELOPER_KEY = "AIzaSyDZEpCIRqY3mrXcZCp1y74ifi9upWssi0U";


    public static String SenderId = "596889279370";
    public static String HubName = "Rukmin18NotificationHub";
    public static String HubListenConnectionString = "Endpoint=sb://rukmin18notificationhubns.servicebus.windows.net/;SharedAccessKeyName=DefaultFullSharedAccessSignature;SharedAccessKey=CFKWsn9RCFgMOccZW1KkFp5MWjBOOKYbb4Fy3bipuxI=";

    public static String containerName = "combined1container";
    public static String storageConnectionString = "DefaultEndpointsProtocol=https;AccountName=combined1storage;AccountKey=D856mJCm1BYaPyaq04nO5AwwdA5JExmPGWjLDfOWhoG4QRGLIeIGRf9YcMOINDqDo1DvVMJ1IvSR4WWizXXYuw==;EndpointSuffix=core.windows.net";
    public static String Storage_url = "https://combined1storage.blob.core.windows.net/combined1container/";

//    public static String SenderId = "114188057736";
//    public static String HubName = "NewSparshNotificationHub";
//    public static String HubListenConnectionString = "Endpoint=sb://newsparshnotificationhubns.servicebus.windows.net/;SharedAccessKeyName=DefaultFullSharedAccessSignature;SharedAccessKey=yNSW81p0ccoxag1HW+YLrzysa/pdVqQy0/dRMxXVgwU=";

//    public static String containerName = "newstoragecontainer";
//    public static String storageConnectionString = "DefaultEndpointsProtocol=https;AccountName=newsparshstorage;AccountKey=yjO8xlELU3YtjpIqsg/HvQlUdu2Fex4ysufcfHXs1c8rkQUTFCYIy4CIyDgPFeIg+aoOpl1+80OYpk4JT5+JZw==;EndpointSuffix=core.windows.net";
//    public static String Storage_url = "https://newsparshstorage.blob.core.windows.net/newstoragecontainer/";

    public static CloudBlobContainer getContainer() throws Exception {
        // Retrieve storage account from connection-string.

        CloudStorageAccount storageAccount = CloudStorageAccount.parse(AzureConfiguration.storageConnectionString);

        // Create the blob client.
        CloudBlobClient blobClient = storageAccount.createCloudBlobClient();
        // Get a reference to a container.
        // The container name must be lower case
        CloudBlobContainer container = blobClient.getContainerReference(AzureConfiguration.containerName);

        return container;
    }
}
