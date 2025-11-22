# 📚 Project-2 LMS — 图书管理系统（Library Management System）

> Java 学习练手项目 2  
> 基于控制台的简易图书管理系统，用来巩固：
> - 面向对象（类 / 对象）
> - 分层设计（app / service / model / util）
> - Scanner 输入与基本业务逻辑

---

## 🏗 项目结构

```text
Project-2 LMS/
├── README.md
└── src/
     └── lms/
          ├── app/          # 程序入口、菜单等（MainApp）
          ├── model/        # 核心实体类（Book 等）
          ├── service/      # 业务逻辑（增删查改图书）
          └── util/         # 工具类（安全输入、全局 Scanner 等）
```
---

##  当前功能（已实现）

```text     
• 添加图书 ✅
• 查看所有图书 ✅
• 删除图书 ✅
• 按书名搜索图书 ✅
• 借出图书
• 归还图书
• 将图书信息保存到文件（JSON / 文本）
• 程序启动时自动读取历史数据