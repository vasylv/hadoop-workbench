// JAXB

package com.directv.hw.hadoop.oozie.bindings.spark_action_0_2.binding

import java.util.{ArrayList, List}
import javax.xml.bind.annotation.{XmlAccessType, XmlAccessorType, XmlType}

import scala.beans.BeanProperty


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PREPARE", propOrder = Array("delete", "mkdir"), namespace = "uri:oozie:spark-action:0.2") class PREPARE {
  @BeanProperty var delete: List[DELETE] = new ArrayList[DELETE]
  @BeanProperty var mkdir: List[MKDIR] = new ArrayList[MKDIR]


}
