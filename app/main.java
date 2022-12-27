//Global Variables
let users = [];

//Classes
class User {
    constructor(name, id) {
        this.name = name;
        this.id = id;
        this.room = null;
    }

    //Methods
    joinRoom(roomId) {
        this.room = roomId;
    }
}

class Room {
    constructor(roomId, name) {
        this.roomId = roomId;
        this.name = name;
        this.users = [];
    }

    //Methods
    addUser(user) {
        this.users.push(user);
    }

    removeUser(userId) {
        const user = this.getUser(userId);

        if (user) {
            this.users = this.users.filter(user => user.id !== userId);
        }
        return user;
    }

    getUser(userId) {
        return this.users.find(user => user.id === userId);
    }
}

//Functions
function createUser(name,
