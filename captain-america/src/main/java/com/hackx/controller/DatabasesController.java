package com.hackx.controller;

import com.hackx.common.GsonUtil;
import com.hackx.entity.DatabasesEntity;
import com.hackx.service.DatabasesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 曹磊(Hackx) on 3/11/2017.
 * Email: caolei@mobike.com
 */
@RestController
public class DatabasesController {

    public static Logger logger = LoggerFactory.getLogger(DatabasesController.class);

    @Resource
    DatabasesService databasesService;

    @RequestMapping(value = "getDatabasesList", method = RequestMethod.GET)
    @ResponseBody
    public String getDatabasesList() {
        try {
            List<DatabasesEntity> databases = databasesService.findAll();
            return GsonUtil.toJson(databases);
        } catch (Exception e) {
            logger.error("exception occur when getDatabasesList ", e);
        }
        return "";
    }
}
