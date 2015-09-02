/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.stratos.messaging.event.topology;

import org.apache.stratos.messaging.domain.instance.ClusterInstance;
import org.apache.stratos.messaging.event.Event;

/**
 * Cluster activated event will be sent by Autoscaler
 */
public class ClusterInstanceCreatedEvent extends Event {

    private final String serviceUuid;
    private final String clusterId;
    private String partitionId;
    private String networkPartitionId;
    private ClusterInstance clusterInstance;


    public ClusterInstanceCreatedEvent(String serviceUuid, String clusterId,
                                       ClusterInstance clusterInstance) {
        this.serviceUuid = serviceUuid;
        this.clusterId = clusterId;
        this.clusterInstance = clusterInstance;
    }

    public String getServiceUuid() {
        return serviceUuid;
    }

    @Override
    public String toString() {
        return "ClusterInstanceCreatedEvent [serviceName=" + serviceUuid + ", clusterStatus=" +
                "]";
    }

    public String getClusterId() {
        return clusterId;
    }

    public String getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(String partitionId) {
        this.partitionId = partitionId;
    }

    public String getNetworkPartitionId() {
        return networkPartitionId;
    }

    public void setNetworkPartitionId(String networkPartitionId) {
        this.networkPartitionId = networkPartitionId;
    }

    public ClusterInstance getClusterInstance() {
        return clusterInstance;
    }
}
