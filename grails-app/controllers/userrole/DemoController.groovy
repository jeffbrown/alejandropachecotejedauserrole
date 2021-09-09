package userrole

class DemoController {

    def index() {
        UserRole.where {
            // put your query criteria here
        }.list(sort: 'user.username', offset: 0, order: 'asc')
        render 'success'
    }
}
