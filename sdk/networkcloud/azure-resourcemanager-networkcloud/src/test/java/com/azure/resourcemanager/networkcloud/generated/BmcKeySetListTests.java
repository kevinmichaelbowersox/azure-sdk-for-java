// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.BmcKeySetInner;
import com.azure.resourcemanager.networkcloud.models.BmcKeySetList;
import com.azure.resourcemanager.networkcloud.models.BmcKeySetPrivilegeLevel;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BmcKeySetListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BmcKeySetList model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"egizv\",\"value\":[{\"extendedLocation\":{\"name\":\"elisdjub\",\"type\":\"gbqi\"},\"properties\":{\"azureGroupId\":\"kxkbsazgakgacyr\",\"detailedStatus\":\"Validating\",\"detailedStatusMessage\":\"mspofapvuhryl\",\"expiration\":\"2021-10-23T00:02:47Z\",\"lastValidation\":\"2021-02-25T11:36:52Z\",\"privilegeLevel\":\"ReadOnly\",\"provisioningState\":\"Accepted\",\"userList\":[],\"userListStatus\":[]},\"location\":\"jed\",\"tags\":{\"f\":\"kvnlvxbcuiiznkt\",\"bmikost\":\"nsnvpd\",\"kiwbuqnyoph\":\"z\",\"sgcrpfbcunezzce\":\"fy\"},\"id\":\"elfwy\",\"name\":\"wl\",\"type\":\"xjwet\"},{\"extendedLocation\":{\"name\":\"psihcla\",\"type\":\"zvaylptrsqqw\"},\"properties\":{\"azureGroupId\":\"tcmwqkchc\",\"detailedStatus\":\"AllActive\",\"detailedStatusMessage\":\"fewz\",\"expiration\":\"2021-03-21T20:05:59Z\",\"lastValidation\":\"2021-01-10T06:21:29Z\",\"privilegeLevel\":\"Administrator\",\"provisioningState\":\"Canceled\",\"userList\":[],\"userListStatus\":[]},\"location\":\"vhpsylkkshkbffmb\",\"tags\":{\"tf\":\"jrgywwpgjxsn\",\"pttaqutd\":\"jgicgaao\"},\"id\":\"wemxswvruunzz\",\"name\":\"gehkfkimrtixokff\",\"type\":\"yinljqe\"},{\"extendedLocation\":{\"name\":\"qwhix\",\"type\":\"onsts\"},\"properties\":{\"azureGroupId\":\"i\",\"detailedStatus\":\"SomeInvalid\",\"detailedStatusMessage\":\"elfclducc\",\"expiration\":\"2021-06-28T02:53:43Z\",\"lastValidation\":\"2020-12-30T21:40:21Z\",\"privilegeLevel\":\"ReadOnly\",\"provisioningState\":\"Succeeded\",\"userList\":[],\"userListStatus\":[]},\"location\":\"o\",\"tags\":{\"hgshe\":\"gstmninwjizciln\",\"zvners\":\"jtbxqmuluxlx\",\"qbsms\":\"ycucrwnamikzeb\",\"kzruswh\":\"ziqgfuh\"},\"id\":\"hczznvf\",\"name\":\"ycjsx\",\"type\":\"wwixzvumw\"}]}")
                .toObject(BmcKeySetList.class);
        Assertions.assertEquals("egizv", model.nextLink());
        Assertions.assertEquals("jed", model.value().get(0).location());
        Assertions.assertEquals("kvnlvxbcuiiznkt", model.value().get(0).tags().get("f"));
        Assertions.assertEquals("elisdjub", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("gbqi", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals("kxkbsazgakgacyr", model.value().get(0).azureGroupId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-23T00:02:47Z"), model.value().get(0).expiration());
        Assertions.assertEquals(BmcKeySetPrivilegeLevel.READ_ONLY, model.value().get(0).privilegeLevel());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BmcKeySetList model =
            new BmcKeySetList()
                .withNextLink("egizv")
                .withValue(
                    Arrays
                        .asList(
                            new BmcKeySetInner()
                                .withLocation("jed")
                                .withTags(
                                    mapOf(
                                        "f",
                                        "kvnlvxbcuiiznkt",
                                        "bmikost",
                                        "nsnvpd",
                                        "kiwbuqnyoph",
                                        "z",
                                        "sgcrpfbcunezzce",
                                        "fy"))
                                .withExtendedLocation(new ExtendedLocation().withName("elisdjub").withType("gbqi"))
                                .withAzureGroupId("kxkbsazgakgacyr")
                                .withExpiration(OffsetDateTime.parse("2021-10-23T00:02:47Z"))
                                .withPrivilegeLevel(BmcKeySetPrivilegeLevel.READ_ONLY)
                                .withUserList(Arrays.asList()),
                            new BmcKeySetInner()
                                .withLocation("vhpsylkkshkbffmb")
                                .withTags(mapOf("tf", "jrgywwpgjxsn", "pttaqutd", "jgicgaao"))
                                .withExtendedLocation(
                                    new ExtendedLocation().withName("psihcla").withType("zvaylptrsqqw"))
                                .withAzureGroupId("tcmwqkchc")
                                .withExpiration(OffsetDateTime.parse("2021-03-21T20:05:59Z"))
                                .withPrivilegeLevel(BmcKeySetPrivilegeLevel.ADMINISTRATOR)
                                .withUserList(Arrays.asList()),
                            new BmcKeySetInner()
                                .withLocation("o")
                                .withTags(
                                    mapOf(
                                        "hgshe",
                                        "gstmninwjizciln",
                                        "zvners",
                                        "jtbxqmuluxlx",
                                        "qbsms",
                                        "ycucrwnamikzeb",
                                        "kzruswh",
                                        "ziqgfuh"))
                                .withExtendedLocation(new ExtendedLocation().withName("qwhix").withType("onsts"))
                                .withAzureGroupId("i")
                                .withExpiration(OffsetDateTime.parse("2021-06-28T02:53:43Z"))
                                .withPrivilegeLevel(BmcKeySetPrivilegeLevel.READ_ONLY)
                                .withUserList(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(BmcKeySetList.class);
        Assertions.assertEquals("egizv", model.nextLink());
        Assertions.assertEquals("jed", model.value().get(0).location());
        Assertions.assertEquals("kvnlvxbcuiiznkt", model.value().get(0).tags().get("f"));
        Assertions.assertEquals("elisdjub", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("gbqi", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals("kxkbsazgakgacyr", model.value().get(0).azureGroupId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-23T00:02:47Z"), model.value().get(0).expiration());
        Assertions.assertEquals(BmcKeySetPrivilegeLevel.READ_ONLY, model.value().get(0).privilegeLevel());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
