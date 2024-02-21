Удаление пользователей: notebook.model.repository.impl.UserRepository.delete

Метод createUser теперь в userController (notebook.controller.UserController)

Перенёс `if (com == EXIT)` в `switch` (UserView, 31 строка)

Исправил некоторые предупреждения (убрал неиспользуемые `import`, добавил `in.close()` в UserValidator)