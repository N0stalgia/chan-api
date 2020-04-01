package net.jackie.chen.Api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
@Api(value = "test", description = "测试")
public class TestControllor {
    @RequestMapping(value = "/t", method = RequestMethod.GET)
    @ApiOperation(
            value = "test",
            notes = "可",
            code = 201,
            consumes = "application/json",
            produces = "application/json"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "创建成功", responseHeaders = {
                    @ResponseHeader(name = "location", response = String.class, description = "需求工单链接")
            }),
            @ApiResponse(code = 409, message = "名称冲突")
    })
    public String tst() {
        return "The world。。。 Time has stopped";
    }
}
