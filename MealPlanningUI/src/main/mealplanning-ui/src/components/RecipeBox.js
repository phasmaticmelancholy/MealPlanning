import { Component } from 'react';
import { PropTypes } from 'prop-types';
import Typography from '@mui/material/Typography';
import Stack from '@mui/material/Stack';

class RecipeBox extends Component {

  static propTypes = {
    recipes: PropTypes.array.isRequired,
  }

  render()
      {

      return(<Typography sx={{ mt: 6, mb: 3 }} color="text.secondary">
        <Stack spacing = {2}>
            {this.props.recipes.map(recipe => <div>{recipe}</div>)}
        </Stack>
    </Typography>
  );
  }
}

export default RecipeBox;