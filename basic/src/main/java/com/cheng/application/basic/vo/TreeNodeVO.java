package com.cheng.application.basic.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 树节点vo
 *
 * @author chengys4
 *         2017-09-01 18:09
 **/
@Getter
@Setter
public class TreeNodeVO implements Serializable {

    private String nodeName;
    private long nodeId;
    private long parentNodeId;
    private String isSeaf;
    private String url;
    private Object value;
    private List<TreeNodeVO> children = new ArrayList<>();

    public void addChild(TreeNodeVO node) {
        children.add(node);
    }
}
