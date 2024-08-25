# Software-architecture-6
Архитектура ПО (семинары) Урок 6. Принципы построения приложений «чистая архитектура»

# Приложение для заметок
Это простой демо-проект приложения для заметок, реализующий принципы чистой архитектуры.

Структура
Приложение содержит следующие модули:

- `database` - содержит сущности базы данных, такие как `NotesDatabase`, `NotesTable`, `NotesRecord`
- `notes` - основная бизнес-логика
- - `core` - ядро приложения
- - - `application` - реализация use case, `ConcreteNoteEditor`
- - - `domain` - сущности предметной области, например `Note`
- - `infrastructure` - детали реализации:
- - - `persistance` - доступ к БД
- - - `notifications`
- - - `search`
- - `presentation` - frontend приложения:
- - - `commands`
- - - `queries` - API запросов
- - - - `controllers` - контроллеры запросов, например `NotesController`
- - - - `views` - презентеры, например `NotesConsolePresenter`
- - - `services`
Точка входа приложения - класс `Program`, который инициализирует `NotesController` и выполняет use case `routeGetAll`.

# Основные моменты
- Использование интерфейсов вроде `Database`, `NoteEditor` для абстракции реализаций
- Подход слоистой архитектуры с разделением ядра, инфраструктуры и представления
- `ConcreteNoteEditor` реализует use case `NoteEditor` взаимодействуя с `Context` и `Presenter`
- `NotesController` обрабатывает запросы и вызывает бизнес-логику `NoteEditor`
- Доступ к БД реализован через `NotesDbContext`, реализующий `NotesDatabaseContext`
- Использование SOLID принципов, таких как инверсия зависимостей между `NotesController` и `NoteEditor`

Данный проект демонстрирует использование подхода гексагональной/чистой архитектуры для структурирования простого CRUD приложения

# Домашнее задание
UML-диаграмма комплекса.

![](UML.png)






