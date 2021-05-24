# Android通用电商框架设计(Mocha-Framework)

## 项目主要结构图
![](https://github.com/jackytallow/Mocha-Framework/blob/master/contrut.png)



## 模块分解
- 注解model：提供代码生成器所需要的注解
- 代码生成器model：从注解获取信息，通过annotationProcessor或者apt生成代码
- 核心momde：路由架构，相当于中转器，HTTP请求，以及照相和二维码以及图片裁剪
还具有共性的通用UI，通用工具，Webview工具
微信登录和支付封装，支付包支付封装，诸多重复性的处理
- 业务model：相应一类业务的特殊UI，通用逻辑，特殊处理
- 具体项目model：特有个别功能，第三方库，UI以及逻辑会更改的，一些签名和验证

## 项目结构组成
- mocha-annotations类型为Java Library
- mocha-complier类型为Java Library
- mocha-core类型为Android Library
- mocha-ec类型为Android Library
- 项目model类型为Android Application


