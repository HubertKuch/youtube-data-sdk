package com.hubert.youtube.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamInitialDataSDKTest {

    private final String TEST_JSON = """
            {
              "responseContext": {
                "serviceTrackingParams": [
                  {
                    "service": "CSI",
                    "params": [
                      {
                        "key": "c",
                        "value": "WEB"
                      },
                      {
                        "key": "cver",
                        "value": "2.20221122.06.00"
                      },
                      {
                        "key": "yt_li",
                        "value": "1"
                      },
                      {
                        "key": "GetWatchNext_rid",
                        "value": "0xd863a7e693d33a3c"
                      }
                    ]
                  },
                  {
                    "service": "GFEEDBACK",
                    "params": [
                      {
                        "key": "logged_in",
                        "value": "1"
                      },
                      {
                        "key": "e",
                        "value": "1714251,9405987,23804281,23882503,23885490,23918597,23934970,23946420,23966208,23983296,23986016,23998056,24001373,24002022,24002025,24004644,24007246,24034168,24036948,24059444,24059508,24077241,24080738,24120820,24135310,24135692,24140247,24152443,24161116,24162920,24164186,24166867,24169501,24181174,24181491,24187043,24187377,24191629,24197450,24199724,24208764,24209349,24211178,24217229,24217535,24219713,24229161,24241378,24248092,24248956,24255165,24255543,24255545,24260378,24261941,24262346,24263796,24267564,24268142,24279196,24283093,24285600,24287327,24288043,24288442,24288912,24290971,24291857,24292955,24293803,24298326,24299747,24390675,24391543,24392401,24396645,24397910,24398048,24398991,24398998,24401557,24402891,24406313,24406605,24407200,24407665,24407965,24408851,24411032,24414162,24415866,24416651,24416707,24417236,24417486,24419369,24420756,24421159,24421162,24421637,24421966,24424488,24426959,24590921,39322504,39322574"
                      }
                    ]
                  },
                  {
                    "service": "GUIDED_HELP",
                    "params": [
                      {
                        "key": "logged_in",
                        "value": "1"
                      }
                    ]
                  },
                  {
                    "service": "ECATCHER",
                    "params": [
                      {
                        "key": "client.version",
                        "value": "2.20221122"
                      },
                      {
                        "key": "client.name",
                        "value": "WEB"
                      },
                      {
                        "key": "client.fexp",
                        "value": "24263796,24248092,24166867,24398048,24248956,24283093,24267564,24415866,24392401,24298326,24007246,24197450,24402891,24059444,24285600,24421966,24407965,24255165,24262346,23998056,24421162,24169501,23885490,24426959,24241378,24293803,24417236,24077241,24004644,24208764,24002022,23918597,24162920,24407200,24080738,24279196,24401557,23986016,24288442,39322574,24421159,24219713,24424488,24417486,24002025,39322504,24288912,24036948,24255545,24408851,24421637,24135692,24396645,23882503,24411032,24161116,24191629,24416707,24217535,24187043,24299747,24181491,24390675,24420756,24416651,24268142,24292955,24419369,24187377,24590921,24209349,24290971,24391543,24120820,24398998,24001373,24199724,24398991,9405987,24217229,24406313,24260378,24407665,24261941,24164186,23966208,24255543,24135310,24229161,23946420,24181174,24291857,23934970,24211178,24287327,24406605,24414162,23804281,24397910,24034168,23983296,1714251,24140247,24152443,24059508,24288043"
                      }
                    ]
                  }
                ],
                "mainAppWebResponseContext": {
                  "datasyncId": "117120868292180719978||",
                  "loggedOut": false
                },
                "webResponseContextExtensionData": {
                  "ytConfigData": {
                    "visitorData": "CgtRRmNTSlR3NGFRWSi-p_6bBg%3D%3D",
                    "sessionIndex": 0,
                    "rootVisualElementType": 3832
                  },
                  "webPrefetchData": {
                    "navigationEndpoints": [
                      {
                        "clickTrackingParams": "CAAQg2ciEwjikrLhlsf7AhUIWLIKHTrOB34yDHJlbGF0ZWQtYXV0b0jwqe6j8LOv8D-aAQUIAxD4HQ==",
                        "commandMetadata": {
                          "webCommandMetadata": {
                            "url": "/watch?v=b5qMvxaLcuE\\u0026pp=QAFIAQ%3D%3D",
                            "webPageType": "WEB_PAGE_TYPE_WATCH",
                            "rootVe": 3832
                          }
                        },
                        "watchEndpoint": {
                          "videoId": "b5qMvxaLcuE",
                          "params": "EAEYAdoBAggB",
                          "playerParams": "QAFIAQ%3D%3D",
                          "watchEndpointSupportedPrefetchConfig": {
                            "prefetchHintConfig": {
                              "prefetchPriority": 0,
                              "countdownUiRelativeSecondsPrefetchCondition": -3
                            }
                          }
                        }
                      },
                      {
                        "clickTrackingParams": "CAAQg2ciEwjikrLhlsf7AhUIWLIKHTrOB34yDHJlbGF0ZWQtYXV0b0jwqe6j8LOv8D-aAQUIAxD4HQ==",
                        "commandMetadata": {
                          "webCommandMetadata": {
                            "url": "/watch?v=b5qMvxaLcuE\\u0026pp=QAFIAQ%3D%3D",
                            "webPageType": "WEB_PAGE_TYPE_WATCH",
                            "rootVe": 3832
                          }
                        },
                        "watchEndpoint": {
                          "videoId": "b5qMvxaLcuE",
                          "params": "EAEYAdoBAggB",
                          "playerParams": "QAFIAQ%3D%3D",
                          "watchEndpointSupportedPrefetchConfig": {
                            "prefetchHintConfig": {
                              "prefetchPriority": 0,
                              "countdownUiRelativeSecondsPrefetchCondition": -3
                            }
                          }
                        }
                      },
                      {
                        "clickTrackingParams": "CAAQg2ciEwjikrLhlsf7AhUIWLIKHTrOB34yDHJlbGF0ZWQtYXV0b0jwqe6j8LOv8D-aAQUIAxD4HQ==",
                        "commandMetadata": {
                          "webCommandMetadata": {
                            "url": "/watch?v=b5qMvxaLcuE\\u0026pp=QAFIAQ%3D%3D",
                            "webPageType": "WEB_PAGE_TYPE_WATCH",
                            "rootVe": 3832
                          }
                        },
                        "watchEndpoint": {
                          "videoId": "b5qMvxaLcuE",
                          "params": "EAEYAdoBAggB",
                          "playerParams": "QAFIAQ%3D%3D",
                          "watchEndpointSupportedPrefetchConfig": {
                            "prefetchHintConfig": {
                              "prefetchPriority": 0,
                              "countdownUiRelativeSecondsPrefetchCondition": -3
                            }
                          }
                        }
                      }
                    ]
                  },
                  "hasDecorated": true
                }
              },
              "contents": {
                "twoColumnWatchNextResults": {
                  "results": {
                    "results": {
                      "contents": [
                        {
                          "videoPrimaryInfoRenderer": {
                            "title": {
                              "runs": [
                                {
                                  "text": "🔴 NA ŻYWO 🎱👱‍♀️ Odważne umysły 🐻🐯 Masza i Niedźwiedź 🦁 Masha and the Bear LIVE"
                                }
                              ]
                            },
                            "viewCount": {
                              "videoViewCountRenderer": {
                                "viewCount": {
                                  "runs": [
                                    {
                                      "text": "191"
                                    },
                                    {
                                      "text": " watching now"
                                    }
                                  ]
                                },
                                "isLive": true
                              }
                            },
                            "videoActions": {
                              "menuRenderer": {
                                "items": [
                                  {
                                    "menuServiceItemRenderer": {
                                      "text": {
                                        "runs": [
                                          {
                                            "text": "Report"
                                          }
                                        ]
                                      },
                                      "icon": {
                                        "iconType": "FLAG"
                                      },
                                      "serviceEndpoint": {
                                        "clickTrackingParams": "COwBEMyrARgAIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                        "commandMetadata": {
                                          "webCommandMetadata": {
                                            "sendPost": true,
                                            "apiUrl": "/youtubei/v1/flag/get_form"
                                          }
                                        },
                                        "getReportFormEndpoint": {
                                          "params": "EgtQLUM5bndSN2xQQUABWAF4BZIBNwo1EjNodHRwczovL2kueXRpbWcuY29tL3ZpL1AtQzlud1I3bFBBL2RlZmF1bHRfbGl2ZS5qcGc%3D"
                                        }
                                      },
                                      "trackingParams": "COwBEMyrARgAIhMI4pKy4ZbH-wIVCFiyCh06zgd-"
                                    }
                                  }
                                ],
                                "trackingParams": "COwBEMyrARgAIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                "topLevelButtons": [
                                  {
                                    "segmentedLikeDislikeButtonRenderer": {
                                      "likeButton": {
                                        "toggleButtonRenderer": {
                                          "style": {
                                            "styleType": "STYLE_TEXT"
                                          },
                                          "isToggled": false,
                                          "isDisabled": false,
                                          "defaultIcon": {
                                            "iconType": "LIKE"
                                          },
                                          "defaultText": {
                                            "accessibility": {
                                              "accessibilityData": {
                                                "label": "40 likes"
                                              }
                                            },
                                            "simpleText": "40"
                                          },
                                          "defaultServiceEndpoint": {
                                            "clickTrackingParams": "CPkBEJhNIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                            "commandExecutorCommand": {
                                              "commands": [
                                                {
                                                  "clickTrackingParams": "CPkBEJhNIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                                  "updateToggleButtonStateCommand": {
                                                    "toggled": false,
                                                    "buttonId": "TOGGLE_BUTTON_ID_TYPE_DISLIKE"
                                                  }
                                                },
                                                {
                                                  "clickTrackingParams": "CPkBEJhNIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                                  "commandMetadata": {
                                                    "webCommandMetadata": {
                                                      "sendPost": true,
                                                      "apiUrl": "/youtubei/v1/like/like"
                                                    }
                                                  },
                                                  "likeEndpoint": {
                                                    "status": "LIKE",
                                                    "target": {
                                                      "videoId": "P-C9nwR7lPA"
                                                    },
                                                    "likeParams": "Cg0KC1AtQzlud1I3bFBBIAEyDAi_p_6bBhC22sy7AQ%3D%3D"
                                                  }
                                                }
                                              ]
                                            }
                                          },
                                          "toggledText": {
                                            "accessibility": {
                                              "accessibilityData": {
                                                "label": "41 likes"
                                              }
                                            },
                                            "simpleText": "41"
                                          },
                                          "toggledServiceEndpoint": {
                                            "clickTrackingParams": "CPkBEJhNIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                            "commandMetadata": {
                                              "webCommandMetadata": {
                                                "sendPost": true,
                                                "apiUrl": "/youtubei/v1/like/removelike"
                                              }
                                            },
                                            "likeEndpoint": {
                                              "status": "INDIFFERENT",
                                              "target": {
                                                "videoId": "P-C9nwR7lPA"
                                              },
                                              "removeLikeParams": "Cg0KC1AtQzlud1I3bFBBGAEqDAi_p_6bBhC8lM27AQ%3D%3D"
                                            }
                                          },
                                          "accessibility": {
                                            "label": "like this video along with 40 other people"
                                          },
                                          "trackingParams": "CPkBEJhNIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                          "defaultTooltip": "I like this",
                                          "toggledTooltip": "Unlike",
                                          "toggledStyle": {
                                            "styleType": "STYLE_DEFAULT_ACTIVE"
                                          },
                                          "accessibilityData": {
                                            "accessibilityData": {
                                              "label": "like this video along with 40 other people"
                                            }
                                          },
                                          "toggleButtonSupportedData": {
                                            "toggleButtonIdData": {
                                              "id": "TOGGLE_BUTTON_ID_TYPE_LIKE"
                                            }
                                          },
                                          "targetId": "watch-like"
                                        }
                                      },
                                      "dislikeButton": {
                                        "toggleButtonRenderer": {
                                          "style": {
                                            "styleType": "STYLE_TEXT"
                                          },
                                          "isToggled": false,
                                          "isDisabled": false,
                                          "defaultIcon": {
                                            "iconType": "DISLIKE"
                                          },
                                          "defaultServiceEndpoint": {
                                            "clickTrackingParams": "CPgBEJhNIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                            "commandExecutorCommand": {
                                              "commands": [
                                                {
                                                  "clickTrackingParams": "CPgBEJhNIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                                  "updateToggleButtonStateCommand": {
                                                    "toggled": false,
                                                    "buttonId": "TOGGLE_BUTTON_ID_TYPE_LIKE"
                                                  }
                                                },
                                                {
                                                  "clickTrackingParams": "CPgBEJhNIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                                  "commandMetadata": {
                                                    "webCommandMetadata": {
                                                      "sendPost": true,
                                                      "apiUrl": "/youtubei/v1/like/dislike"
                                                    }
                                                  },
                                                  "likeEndpoint": {
                                                    "status": "DISLIKE",
                                                    "target": {
                                                      "videoId": "P-C9nwR7lPA"
                                                    },
                                                    "dislikeParams": "Cg0KC1AtQzlud1I3bFBBEAEiDAi_p_6bBhCs_827AQ%3D%3D"
                                                  }
                                                }
                                              ]
                                            }
                                          },
                                          "toggledServiceEndpoint": {
                                            "clickTrackingParams": "CPgBEJhNIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                            "commandMetadata": {
                                              "webCommandMetadata": {
                                                "sendPost": true,
                                                "apiUrl": "/youtubei/v1/like/removelike"
                                              }
                                            },
                                            "likeEndpoint": {
                                              "status": "INDIFFERENT",
                                              "target": {
                                                "videoId": "P-C9nwR7lPA"
                                              },
                                              "removeLikeParams": "Cg0KC1AtQzlud1I3bFBBGAEqDAi_p_6bBhDNkM67AQ%3D%3D"
                                            }
                                          },
                                          "accessibility": {
                                            "label": "Dislike this video"
                                          },
                                          "trackingParams": "CPgBEJhNIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                          "defaultTooltip": "I dislike this",
                                          "toggledTooltip": "I dislike this",
                                          "toggledStyle": {
                                            "styleType": "STYLE_DEFAULT_ACTIVE"
                                          },
                                          "accessibilityData": {
                                            "accessibilityData": {
                                              "label": "Dislike this video"
                                            }
                                          },
                                          "toggleButtonSupportedData": {
                                            "toggleButtonIdData": {
                                              "id": "TOGGLE_BUTTON_ID_TYPE_DISLIKE"
                                            }
                                          },
                                          "targetId": "watch-dislike"
                                        }
                                      }
                                    }
                                  },
                                  {
                                    "buttonRenderer": {
                                      "style": "STYLE_DEFAULT",
                                      "size": "SIZE_DEFAULT",
                                      "isDisabled": false,
                                      "text": {
                                        "runs": [
                                          {
                                            "text": "Share"
                                          }
                                        ]
                                      },
                                      "serviceEndpoint": {
                                        "clickTrackingParams": "CPYBEOWWARgHIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                        "commandMetadata": {
                                          "webCommandMetadata": {
                                            "sendPost": true,
                                            "apiUrl": "/youtubei/v1/share/get_share_panel"
                                          }
                                        },
                                        "shareEntityServiceEndpoint": {
                                          "serializedShareEntity": "CgtQLUM5bndSN2xQQQ%3D%3D",
                                          "commands": [
                                            {
                                              "clickTrackingParams": "CPYBEOWWARgHIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                              "openPopupAction": {
                                                "popup": {
                                                  "unifiedSharePanelRenderer": {
                                                    "trackingParams": "CPcBEI5iIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                                    "showLoadingSpinner": true
                                                  }
                                                },
                                                "popupType": "DIALOG",
                                                "beReused": true
                                              }
                                            }
                                          ]
                                        }
                                      },
                                      "icon": {
                                        "iconType": "SHARE"
                                      },
                                      "tooltip": "Share",
                                      "trackingParams": "CPYBEOWWARgHIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                      "accessibilityData": {
                                        "accessibilityData": {
                                          "label": "Share"
                                        }
                                      }
                                    }
                                  }
                                ],
                                "accessibility": {
                                  "accessibilityData": {
                                    "label": "More actions"
                                  }
                                },
                                "flexibleItems": [
                                  {
                                    "menuFlexibleItemRenderer": {
                                      "menuItem": {
                                        "menuServiceItemRenderer": {
                                          "text": {
                                            "runs": [
                                              {
                                                "text": "Save"
                                              }
                                            ]
                                          },
                                          "icon": {
                                            "iconType": "PLAYLIST_ADD"
                                          },
                                          "serviceEndpoint": {
                                            "clickTrackingParams": "CPMBEOuQCSITCOKSsuGWx_sCFQhYsgodOs4Hfg==",
                                            "commandMetadata": {
                                              "webCommandMetadata": {
                                                "sendPost": true
                                              }
                                            },
                                            "signalServiceEndpoint": {
                                              "signal": "CLIENT_SIGNAL",
                                              "actions": [
                                                {
                                                  "clickTrackingParams": "CPMBEOuQCSITCOKSsuGWx_sCFQhYsgodOs4Hfg==",
                                                  "openPopupAction": {
                                                    "popup": {
                                                      "notificationActionRenderer": {
                                                        "responseText": {
                                                          "simpleText": "This action is turned off for content made for kids"
                                                        },
                                                        "actionButton": {
                                                          "buttonRenderer": {
                                                            "text": {
                                                              "simpleText": "Learn more"
                                                            },
                                                            "trackingParams": "CPUBEPBbIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                                            "command": {
                                                              "clickTrackingParams": "CPUBEPBbIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                                              "commandMetadata": {
                                                                "webCommandMetadata": {
                                                                  "url": "//support.google.com/youtube/bin/answer.py?answer=9632097\\u0026nohelpkit=1\\u0026hl=en",
                                                                  "webPageType": "WEB_PAGE_TYPE_UNKNOWN",
                                                                  "rootVe": 83769
                                                                }
                                                              },
                                                              "urlEndpoint": {
                                                                "url": "//support.google.com/youtube/bin/answer.py?answer=9632097\\u0026nohelpkit=1\\u0026hl=en",
                                                                "target": "TARGET_NEW_WINDOW"
                                                              }
                                                            }
                                                          }
                                                        },
                                                        "trackingParams": "CPQBELlqIhMI4pKy4ZbH-wIVCFiyCh06zgd-"
                                                      }
                                                    },
                                                    "popupType": "TOAST"
                                                  }
                                                }
                                              ]
                                            }
                                          },
                                          "trackingParams": "CPMBEOuQCSITCOKSsuGWx_sCFQhYsgodOs4Hfg=="
                                        }
                                      },
                                      "topLevelButton": {
                                        "buttonRenderer": {
                                          "style": "STYLE_VISIBLY_DISABLED",
                                          "size": "SIZE_DEFAULT",
                                          "isDisabled": false,
                                          "text": {
                                            "runs": [
                                              {
                                                "text": "Save"
                                              }
                                            ]
                                          },
                                          "icon": {
                                            "iconType": "PLAYLIST_ADD"
                                          },
                                          "accessibility": {
                                            "label": "Save to"
                                          },
                                          "tooltip": "Save",
                                          "trackingParams": "CPABEOuQCSITCOKSsuGWx_sCFQhYsgodOs4Hfg==",
                                          "accessibilityData": {
                                            "accessibilityData": {
                                              "label": "Save to playlist"
                                            }
                                          },
                                          "command": {
                                            "clickTrackingParams": "CPABEOuQCSITCOKSsuGWx_sCFQhYsgodOs4Hfg==",
                                            "commandMetadata": {
                                              "webCommandMetadata": {
                                                "sendPost": true
                                              }
                                            },
                                            "signalServiceEndpoint": {
                                              "signal": "CLIENT_SIGNAL",
                                              "actions": [
                                                {
                                                  "clickTrackingParams": "CPABEOuQCSITCOKSsuGWx_sCFQhYsgodOs4Hfg==",
                                                  "openPopupAction": {
                                                    "popup": {
                                                      "notificationActionRenderer": {
                                                        "responseText": {
                                                          "simpleText": "This action is turned off for content made for kids"
                                                        },
                                                        "actionButton": {
                                                          "buttonRenderer": {
                                                            "text": {
                                                              "simpleText": "Learn more"
                                                            },
                                                            "trackingParams": "CPIBEPBbIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                                            "command": {
                                                              "clickTrackingParams": "CPIBEPBbIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                                              "commandMetadata": {
                                                                "webCommandMetadata": {
                                                                  "url": "//support.google.com/youtube/bin/answer.py?answer=9632097\\u0026nohelpkit=1\\u0026hl=en",
                                                                  "webPageType": "WEB_PAGE_TYPE_UNKNOWN",
                                                                  "rootVe": 83769
                                                                }
                                                              },
                                                              "urlEndpoint": {
                                                                "url": "//support.google.com/youtube/bin/answer.py?answer=9632097\\u0026nohelpkit=1\\u0026hl=en",
                                                                "target": "TARGET_NEW_WINDOW"
                                                              }
                                                            }
                                                          }
                                                        },
                                                        "trackingParams": "CPEBELlqIhMI4pKy4ZbH-wIVCFiyCh06zgd-"
                                                      }
                                                    },
                                                    "popupType": "TOAST"
                                                  }
                                                }
                                              ]
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                ]
                              }
                            },
                            "trackingParams": "COwBEMyrARgAIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                            "updatedMetadataEndpoint": {
                              "clickTrackingParams": "COwBEMyrARgAIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                              "commandMetadata": {
                                "webCommandMetadata": {
                                  "sendPost": true,
                                  "apiUrl": "/youtubei/v1/updated_metadata"
                                }
                              },
                              "updatedMetadataEndpoint": {
                                "videoId": "P-C9nwR7lPA"
                              }
                            },
                            "superTitleLink": {
                              "runs": [
                                {
                                  "text": "#MaszaiNiedźwiedź",
                                  "navigationEndpoint": {
                                    "clickTrackingParams": "CO8BEKW3AxgAIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                    "commandMetadata": {
                                      "webCommandMetadata": {
                                        "url": "/hashtag/maszainied%C5%BAwied%C5%BA",
                                        "webPageType": "WEB_PAGE_TYPE_BROWSE",
                                        "rootVe": 6827,
                                        "apiUrl": "/youtubei/v1/browse"
                                      }
                                    },
                                    "browseEndpoint": {
                                      "browseId": "FEhashtag",
                                      "params": "6gUWChJtYXN6YWluaWVkxbp3aWVkxboQAQ%3D%3D"
                                    }
                                  },
                                  "loggingDirectives": {
                                    "trackingParams": "CO8BEKW3AxgAIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                    "visibility": {
                                      "types": "12"
                                    },
                                    "enableDisplayloggerExperiment": true
                                  }
                                },
                                {
                                  "text": " "
                                },
                                {
                                  "text": "#animacja",
                                  "navigationEndpoint": {
                                    "clickTrackingParams": "CO4BEKW3AxgCIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                    "commandMetadata": {
                                      "webCommandMetadata": {
                                        "url": "/hashtag/animacja",
                                        "webPageType": "WEB_PAGE_TYPE_BROWSE",
                                        "rootVe": 6827,
                                        "apiUrl": "/youtubei/v1/browse"
                                      }
                                    },
                                    "browseEndpoint": {
                                      "browseId": "FEhashtag",
                                      "params": "6gUMCghhbmltYWNqYRAB"
                                    }
                                  },
                                  "loggingDirectives": {
                                    "trackingParams": "CO4BEKW3AxgCIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                    "visibility": {
                                      "types": "12"
                                    },
                                    "enableDisplayloggerExperiment": true
                                  }
                                },
                                {
                                  "text": " "
                                },
                                {
                                  "text": "#bajkidladzieci",
                                  "navigationEndpoint": {
                                    "clickTrackingParams": "CO0BEKW3AxgEIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                    "commandMetadata": {
                                      "webCommandMetadata": {
                                        "url": "/hashtag/bajkidladzieci",
                                        "webPageType": "WEB_PAGE_TYPE_BROWSE",
                                        "rootVe": 6827,
                                        "apiUrl": "/youtubei/v1/browse"
                                      }
                                    },
                                    "browseEndpoint": {
                                      "browseId": "FEhashtag",
                                      "params": "6gUSCg5iYWpraWRsYWR6aWVjaRAB"
                                    }
                                  },
                                  "loggingDirectives": {
                                    "trackingParams": "CO0BEKW3AxgEIhMI4pKy4ZbH-wIVCFiyCh06zgd-",
                                    "visibility": {
                                      "types": "12"
                                    },
                                    "enableDisplayloggerExperiment": true
                                  }
                                }
                              ]
                            },
                            "dateText": {
                              "simpleText": "Started streaming 6 hours ago"
                            }
                          }
                        }
                      ],
                      "trackingParams": "CNwBELovIhMI4pKy4ZbH-wIVCFiyCh06zgd-"
                    }
                  },
                  "autoplay": {
                    "autoplay": {
                      "sets": [
                        {
                          "mode": "NORMAL",
                          "autoplayVideo": {
                            "clickTrackingParams": "CC4Q4ZIBIhMI4pKy4ZbH-wIVCFiyCh06zgd-MgxyZWxhdGVkLWF1dG9I8Knuo_Czr_A_mgEFCAMQ-B0=",
                            "commandMetadata": {
                              "webCommandMetadata": {
                                "url": "/watch?v=b5qMvxaLcuE\\u0026pp=QAFIAQ%3D%3D",
                                "webPageType": "WEB_PAGE_TYPE_WATCH",
                                "rootVe": 3832
                              }
                            },
                            "watchEndpoint": {
                              "videoId": "b5qMvxaLcuE",
                              "params": "EAEYAdoBAggB",
                              "playerParams": "QAFIAQ%3D%3D",
                              "watchEndpointSupportedPrefetchConfig": {
                                "prefetchHintConfig": {
                                  "prefetchPriority": 0,
                                  "countdownUiRelativeSecondsPrefetchCondition": -3
                                }
                              }
                            }
                          }
                        }
                      ],
                      "countDownSecs": 5,
                      "trackingParams": "CC4Q4ZIBIhMI4pKy4ZbH-wIVCFiyCh06zgd-"
                    }
                  },
                  "conversationBar": {
                    "conversationBarRenderer": {
                      "availabilityMessage": {
                        "messageRenderer": {
                          "text": {
                            "runs": [
                              {
                                "text": "Chat is disabled for this live stream."
                              }
                            ]
                          },
                          "trackingParams": "CC0QljsiEwjikrLhlsf7AhUIWLIKHTrOB34="
                        }
                      }
                    }
                  },
                  "desktopOverlay": {
                    "desktopOverlayConfigRenderer": {
                      "suppressWatchLaterButton": true
                    }
                  }
                }
              }
            }
            """;

    @Test
    void parse() {
        assertDoesNotThrow(() -> {
            StreamInitialDataSDK.parse(TEST_JSON);
        });
    }

    @Test
    void getRoot() throws InvalidInitialDataContentException {
        StreamInitialDataSDK streamInitialDataSDK = StreamInitialDataSDK.parse(TEST_JSON);

        assertNotNull(streamInitialDataSDK.getRoot());
    }

    @Test
    void getPrimaryInfoRenderer() throws InvalidInitialDataContentException {
        StreamInitialDataSDK streamInitialDataSDK = StreamInitialDataSDK.parse(TEST_JSON);

        assertNotNull(streamInitialDataSDK.getPrimaryInfoRenderer());
    }
}