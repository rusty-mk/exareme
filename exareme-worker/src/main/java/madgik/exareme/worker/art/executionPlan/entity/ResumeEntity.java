/**
 * Copyright MaDgIK Group 2010 - 2015.
 */
package madgik.exareme.worker.art.executionPlan.entity;

import madgik.exareme.common.art.entity.EntityName;

import java.io.Serializable;

/**
 * @author Herald Kllapi <br>
 *         University of Athens /
 *         Department of Informatics and Telecommunications.
 * @since 1.0
 */
public class ResumeEntity implements Serializable {

    public String containerName = null;
    public EntityName container = null;
    public String operatorName = null;
    public OperatorEntity operatorEntity = null;

    public ResumeEntity(String operatorName, OperatorEntity operatorEntity, String containerName,
        EntityName container) {
        this.containerName = containerName;
        this.container = container;
        this.operatorName = operatorName;
        this.operatorEntity = operatorEntity;
    }
}
