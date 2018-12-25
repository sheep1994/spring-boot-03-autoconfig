package com.talent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author guobing
 * @Title: AuditUserByShield
 * @ProjectName audit-parent
 * @Description: 监听用户修改并同步到审批人表中
 * @date 2018/12/25上午11:19
 */

@SpringBootApplication
public class SpringBoot03AutoconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot03AutoconfigApplication.class, args);
    }

}

