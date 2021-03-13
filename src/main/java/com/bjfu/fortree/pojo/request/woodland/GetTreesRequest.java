package com.bjfu.fortree.pojo.request.woodland;

import lombok.Data;
import org.springframework.data.domain.Sort;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author warthog
 */
@Data
public class GetTreesRequest {
    @NotNull(message = "记录id不能为空")
    private Long recordId;
    //分页
    @NotNull(message = "分页当前页数不能为空")
    private Integer current;
    @NotNull(message = "分页每页的数量不能为空")
    private Integer pageSize;
    //过滤
    private List<String> treeId;
    private List<String> species;
    //排序
    private String field;
    private Sort.Direction order;
}
