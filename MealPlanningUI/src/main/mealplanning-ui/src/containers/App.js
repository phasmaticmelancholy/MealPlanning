import { Component } from 'react';

import Container from '@mui/material/Container';
import Box from '@mui/material/Box';
import RecipeBox from '../components/RecipeBox';
import RecipeSearch from '../components/RecipeSearch';

class App extends Component
{
    constructor(props) {
            super(props);
            this.state = {ingredients: []};
        }

    handleIngredientChange = (selectedIngredients) => {
        this.setState({ingredients: selectedIngredients});
    }

  render ()
  {
        var baseIngredients = ['apples', 'bananas', 'onions'];
        var baseRecipes = ['Recipe1', 'Recipe2']

      return(
        <Container maxWidth="sm">
          <Box sx={{ my: 4 }}>
            <RecipeSearch ingredients={baseIngredients} handleChange={this.handleIngredientChange} />
            <RecipeBox recipes={baseRecipes} />
          </Box>
        </Container>
      );
  }
}

export default App;