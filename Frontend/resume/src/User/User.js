import React, {Component} from 'react'
import AppNavbar from '../AppNavbar/AppNavbar';
import '../App.css';
import {Input, Label, FormGroup, Container} from 'reactstrap';

class User extends Component {

    emptyResume={
        surname: '',
        firstname: '',
        email: '',
        patronymic: '',
        gender: '',
        experience: false,
        birthday: '',
        keySkills: [],
        languageSkills: [],
        jobs: [],
        educationInstitutions: []
    }

    constructor(props) {
        super(props);
        this.state = {resume: this.emptyResume,isExist: false}
        this.handleChange = this.handleChange.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)
    }

    async componentDidMount() {
        console.log("in componentDidMount")
        await fetch("/api/user/1")
            .then(response => response.json())
            .then(user => {
                console.log(user)
                this.setState({resume: user})
            })

    }

    handleChange(event) {

    }

    async handleSubmit(event) {

    }

    render() {

        const {resume}= this.state
        console.log(resume)
        return (
            <div>
                <AppNavbar/>
                <Container>
                    Resume:
                    <FormGroup>
                        <Label for="surname">Surname</Label>
                        <Input type="text" name="surname" id="surname" value={resume.surname || ''}
                               onChange={this.handleChange} autoComplete="surname"/>
                        <br/>
                        <Label for="firstname">Firstname</Label>
                        <Input type="text" name="firstname" id="firstname" value={resume.firstname || ''}
                               onChange={this.handleChange} autoComplete="firstname"/>
                        <br/>
                        <Label for="patronymic">Patronymic</Label>
                        <Input type="text" name="patronymic" id="patronymic" value={resume.patronymic || ''}
                               onChange={this.handleChange} autoComplete="patronymic"/>
                        <br/>
                        <Label for="birthdayDate">Birthday</Label>
                        <Input type="date" name="birthday" id="birthday"
                               value={resume.birthday || ''}
                               onChange={this.handleChange} autoComplete="birthday"/>

                        <br/>
                        <Label>Gender

                            <select name="gender" value={resume.gender} onChange={this.handleChange}>
                                <option value="Female">Female</option>
                                <option value="Male">Male</option>
                            </select>
                        </Label>

                    </FormGroup>
                </Container>
            </div>
        )
    }

}

export default User;