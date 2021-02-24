import React, {Component} from 'react';
import './App.css';
import Home from './Home/Home';
import User from './User/User';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

class App extends Component{
  render() {
    return (
        <Router>
          <Switch>
            <Route path='/' exact={true} component={Home}/>
            <Route path='/api/user/:id' component={User}/>
          </Switch>
        </Router>
    )
  }
}

export default App;
