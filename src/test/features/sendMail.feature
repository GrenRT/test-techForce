# language: ru
@withdrawal
Функция: Отправка письма

  @success
  Сценарий: Отправка письма адресату
    Допустим пользователь с логином "test71test" и паролем "1qaz@WSX" вошел с систему
    Дано пользователь заполняет форму письма "адресатом", "темой" и пользователь прикрепляет вложение "test.jpg"
    Когда пользователь отправляет письмо
    Тогда письмо успешно отправлено
