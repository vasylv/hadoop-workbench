// JAXB

package com.directv.hw.hadoop.oozie.bindings.sqoop_action_0_4.binding

import javax.xml.bind.annotation.{XmlAccessType, XmlAccessorType, XmlAttribute, XmlType}

import scala.beans.BeanProperty


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DELETE", namespace = "uri:oozie:sqoop-action:0.4") class DELETE {
  @XmlAttribute(name = "path", required = true)
  @BeanProperty var path: String = null

}
