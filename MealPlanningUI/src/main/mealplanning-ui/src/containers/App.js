import { Component } from 'react';
import Container from '@mui/material/Container';
import Box from '@mui/material/Box';
import RecipeBox from '../components/RecipeBox';
import RecipeSearch from '../components/RecipeSearch';

class App extends Component
{
    constructor(props) {
            super(props);
            this.state = {allIngredients: [], ingredients: [], recipes: []} ;
             this.handleIngredientChange = this.handleIngredientChange.bind(this);
        }

    componentDidMount() {
        fetch('http://localhost:8080/ingredients')
            .then((response) => response.json())
            .then((data) => {
                this.setState({allIngredients: data});
            })
            .catch((err) => {
                console.log(err.message);
            });
    }

    handleIngredientChange = (selectedIngredients) => {
        console.log(selectedIngredients);
        const ingredientNames = "name=onion";

        fetch('http://localhost:8080/recipes/ingredients?' + ingredientNames)
            .then((response) => response.json())
            .then((data) => {
                this.setState({recipes: data});
            })
            .catch((err) => {
                console.log(err.message);
            });
    }

  render ()
  {
      return(
        <Container maxWidth="sm">
          <Box sx={{ my: 4 }}>
            <RecipeSearch ingredients={this.state.allIngredients} handleChange={this.handleIngredientChange} />
            <RecipeBox recipes={this.state.recipes} />
          </Box>
        </Container>
      );
  }
}

export default App;