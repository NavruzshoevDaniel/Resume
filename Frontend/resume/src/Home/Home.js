import React, { Component } from 'react';
import '../App.css';
import AppNavbar from '../AppNavbar/AppNavbar';
import { Link } from 'react-router-dom';
import { Button, Container } from 'reactstrap';

class Home extends Component {
    render() {
        return (
            <div>
                <AppNavbar/>
                <Container fluid>
                    <Button color="link" className="btn btn-light"><Link to="/user/1">Companies</Link></Button>
                </Container>
            </div>
        );
    }
}

export default Home;